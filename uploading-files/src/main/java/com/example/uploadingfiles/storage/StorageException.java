package com.example.uploadingfiles.storage;

public class StorageException extends RuntimeException {
    private static final long serialVersionUID = -5197833330671071039L;

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
