package com.ssoon;

/**
 * @author LeeSooHoon
 */
public interface MessageRepository {
    Iterable<Message> findAll();

    Message save(Message message);

    Message findMessage(Long id);
}
