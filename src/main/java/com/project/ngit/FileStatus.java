package com.project.ngit;

import java.io.Serializable;

public record FileStatus(String fileHash, String lastModifiedDate) implements Serializable {
}
