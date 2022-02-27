package com.dthservice.consumers.controller;

import com.dthservice.consumers.entity.Consumer;
import com.dthservice.consumers.exception.BadConsumerException;
import com.dthservice.consumers.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/{custId}/exists")
    public ResponseEntity<Boolean> existsByIdAction(@PathVariable("custId") Long custId) throws BadConsumerException {
        return ResponseEntity.ok(consumerService.existsById(custId));
    }

    @GetMapping("/{custId}")
    public ResponseEntity<Consumer> getConsumerById(@PathVariable("custId") Long custId) throws BadConsumerException {
        return ResponseEntity.ok(consumerService.getById(custId));
    }

    @PostMapping
    public ResponseEntity<Consumer> addConsumer(@RequestBody Consumer consumer) throws BadConsumerException {
        return new ResponseEntity<Consumer>(consumerService.add(consumer), HttpStatus.CREATED);
    }
}
