package com.gitforge.backend.application.usecase;

import com.gitforge.backend.application.port.RepositoryGenerationPort;
import com.gitforge.backend.domain.model.RepositoryPreview;
import com.gitforge.backend.web.dto.GenerateRepositoryRequest;
import com.gitforge.backend.web.dto.RepositoryPreviewResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenerateRepositoryPreviewUseCase {
    private final RepositoryGenerationPort repositoryGenerationPort;

    public RepositoryPreview execute(String prompt) {
        return repositoryGenerationPort.generateRepositoryPreview(prompt);
    }
}