package com.metacoding.upload;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UploadService {

    private final UploadRepository uploadRepository;
}
