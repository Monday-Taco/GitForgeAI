package com.gitforge.backend.application.port;

import com.gitforge.backend.domain.model.RepositoryPreview;

public interface RepositoryGenerationPort {
    RepositoryPreview generateRepositoryPreview(String prompt);

}
