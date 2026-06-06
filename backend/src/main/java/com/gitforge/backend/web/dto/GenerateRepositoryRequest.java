package com.gitforge.backend.web.dto;

import jakarta.validation.constraints.NotBlank;

public record GenerateRepositoryRequest(
        @NotBlank(message = "Prompt is required")
        String prompt
) {
}