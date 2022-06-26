package com.assignment.flow.extblocker.api;

import com.assignment.flow.extblocker.dto.DefaultExtForm;
import com.assignment.flow.extblocker.entity.DefaultExt;
import com.assignment.flow.extblocker.repository.DataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ExtApiController {
    /*
    @Autowired
    private DataRepository dataRepository;

    @PostMapping("/api/default")
    public Long saveDefaultStatus(@RequestBody DefaultExtForm form) {
        log.info(form.toString());
        DefaultExt defaultExt = form.toEntity();

        DefaultExt saved = dataRepository.save(defaultExt);
        log.info(saved.toString());
        return saved.getId();
    }

    @PostMapping("/api/addCustom")
    public Long addCustom(@RequestBody DefaultExtForm form) {
        log.info(form.toString());
        DefaultExt defaultExt = form.toEntity();

        DefaultExt saved = dataRepository.save(defaultExt);
        log.info(saved.toString());
        return saved.getId();
    }
    */
}
