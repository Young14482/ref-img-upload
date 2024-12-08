package com.metacoding.upload;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class UploadController {

    private final UploadService uploadService;
}
