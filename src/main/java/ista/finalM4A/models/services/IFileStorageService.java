package ista.finalM4A.models.services;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;


public interface IFileStorageService {
    String store(MultipartFile file);
    Resource loadAsResource(String fileName);
    void delete(String fileName);
}