package com.sist.common;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageChange { // 이미지 크기를 조절하는 메소드 재정의
	public static Image getImage(ImageIcon icon,int w,int h) {
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}