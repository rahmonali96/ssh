package com.example.ssh.service;

import com.example.ssh.model.ListNode;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyService {
    public ListNode makeFromString(String s) {
        return make(Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray(), new ListNode(), 0);
    }
    private ListNode make(int[] args, ListNode listNode, int x) {
        listNode.val = args[x];
        x++;
        if (x < args.length) {
            listNode.next = make(args, new ListNode(), x);
        }
        return listNode;
    }
}
