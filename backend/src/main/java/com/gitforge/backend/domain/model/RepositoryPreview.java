package com.gitforge.backend.domain.model;

public record RepositoryPreview(
    String repositoryName,
    String description,
    String readme
) {
}
