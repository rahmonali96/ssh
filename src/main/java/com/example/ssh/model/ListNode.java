package com.example.ssh.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ListNode {
    public int val;
    public ListNode next;

    @JsonCreator
    public ListNode() {
    }

    @JsonCreator
    public ListNode(int val) {
        this.val = val;
    }

    @JsonCreator
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
