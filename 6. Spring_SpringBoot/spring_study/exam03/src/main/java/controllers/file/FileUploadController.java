package controllers.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file/upload")
public class FileUploadController {
    @Value("${file.upload.path}")
    private String uploadDir;

    @GetMapping
    public String upload() {

        return "file/upload";
    }

    @PostMapping
    public String uploadPs(MultipartFile[] files) {
        for (MultipartFile file : files) {
            File uploadPath = new File(uploadDir + file.getOriginalFilename());
            try {
                file.transferTo(uploadPath);
            } catch (IOException e) {
            }
        }
        return "file/upload";
    }
}