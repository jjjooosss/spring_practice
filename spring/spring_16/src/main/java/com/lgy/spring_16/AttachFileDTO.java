package com.lgy.spring_16;

import lombok.Data;

@Data
public class AttachFileDTO {
	private String fileName;
	private String uploadPath;
	private String uuid;
	private boolean image;
}
