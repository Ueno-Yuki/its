package com.example.its.domain.issue;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepesitory issueRepesitory;

    public List<IssueEntity> findAll() {
        return issueRepesitory.findAll();
    }

    @Transactional
    public void create(String summary, String description) {
        issueRepesitory.insert(summary, description);
    }
}
