package com.gitforge.backend.web.dto;

public record RepositoryPreviewResponse(
        String repositoryName,
        String description,
        String readme
) {
}