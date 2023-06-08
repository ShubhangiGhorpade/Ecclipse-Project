package com.xworkz.donation.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.donation.constant.DonationConstant;
import com.xworkz.donation.dto.DonationDTO;

@Component
@RequestMapping("/")
public class DonationController implements WebMvcConfigurer {

	public DonationController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@PostMapping("/save")
	public String onDonate(@Valid DonationDTO dto, BindingResult br,
			Model model, MultipartFile file) throws IOException {
		System.out.println("DTO :" + dto);
		if (br.hasErrors()) {
			model.addAttribute("error", br.getAllErrors());
			System.err.println("Data is invalid");
			br.getAllErrors().forEach(
					e -> System.err.println(e.getDefaultMessage()));
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("successMsg", "Blood Donated by "
					+ dto.getName() + " is succesfull");
			System.out.println("Data is valid");

			System.out.println("File Received:" + file.getName());
			System.out.println("File Size:" + file.getSize());
			System.out.println("File Type:" + file.getContentType());
			System.out.println("File bytes:" + file.getBytes());

			File physicalFile = new File(DonationConstant.FILE_NAME
					+ file.getOriginalFilename());

		try(OutputStream os=new FileOutputStream(physicalFile))
			{
				os.write(file.getBytes());
			}
		}
		return "/Donation.jsp";

	}
	
	@GetMapping("/fileDownload")
	public void sendImage(String fileName,String contentType,HttpServletResponse response) throws IOException {
		System.out.println("Running sendImage....");
		
		File file=new File(DonationConstant.FILE_NAME+fileName);
		
		response.setContentType(contentType);
		OutputStream os=response.getOutputStream();
		FileInputStream in=new FileInputStream(file);
		byte[] buffer=new byte[4096];
		int length;
		while((length=in.read(buffer))>0){
			os.write(buffer,0,length);
		}
		in.close();
		os.flush();
		
	}

}
