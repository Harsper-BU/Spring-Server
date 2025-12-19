package com.website.violation;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth/violations")
public class ViolationController {
    private final ViolationService violationService;
    private final SimpMessagingTemplate simpMessagingTemplate;

    public ViolationController(ViolationService violationService, SimpMessagingTemplate simpMessagingTemplate) {
        this.violationService = violationService;
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @GetMapping
    public ResponseEntity<Page<ViolationMainPageDto>> getViolationDataByPage(@RequestParam int page){
        return ResponseEntity.ok().body(violationService.getViolationDataByPage(page));
    }

    @PostMapping
    public void insertViolationData(@RequestBody ViolationDto violationDto){
        if(violationDto.getNoHelmetCount()>0){
            simpMessagingTemplate.convertAndSend("/sub/violation-alert", "위반이 발생했습니다.");
        }
        violationService.insertViolationData(violationDto);
    }
}
