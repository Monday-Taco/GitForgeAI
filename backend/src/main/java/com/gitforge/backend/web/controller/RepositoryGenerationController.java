package com.gitforge.backend.web.controller;

import com.gitforge.backend.application.GenerateRepositoryPreviewUseCase;
import com.gitforge.backend.web.dto.GenerateRepositoryRequest;
import com.gitforge.backend.web.dto.RepositoryPreviewResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/repositories")
@RequiredArgsConstructor
public class RepositoryGenerationController {

    private final GenerateRepositoryPreviewUseCase generateRepositoryPreviewUseCase;

    @PostMapping("/generate")
    public ResponseEntity<RepositoryPreviewResponse> generateRepositoryPreview(
            @Valid @RequestBody GenerateRepositoryRequest request
    ) {
        RepositoryPreviewResponse response = generateRepositoryPreviewUseCase.execute(request);
        return ResponseEntity.ok(response);
    }
}