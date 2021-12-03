package com.omfgdevelop.tinycloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Controller()
public class FileController {

    @Value("@{app.file.store}")
    private String fileStore;

    @PostMapping(consumes = "content/multipart", value = "upload")
    private String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Model model) {

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload.");
            return "redirect:/";
        }

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            Path path = Paths.get(fileStore + UUID.randomUUID());
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // return success response
        attributes.addFlashAttribute("message", "You successfully uploaded " + fileName + '!');

        return "redirect:/";
    }
}
