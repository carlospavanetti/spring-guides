package com.example.uploadingfiles.storage;

public class StorageFileNotFoundException extends StorageException {
    private static final long serialVersionUID = 3620291730359871104L;

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
