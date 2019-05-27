package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<h1>List of the Doctors</h1>"+

		"<ul>" +
				"<li><a href='/doctor/1'>William Hartnell</a></li>"+
				"<li><a href='/doctor/2'> Patrick Troughton</a></li>"+
				"<li><a href='/doctor/3'> Jon Pertwee</a></li>"+
				"<li><a href='/doctor/4'> Tom Baker</a></li>"+

		"</ul>";
	}



	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "<a href='https://upload.wikimedia.org/wikipedia/en/a/aa/William_Hartnell.jpg'> William Hartnell </a>";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "<a herf='https://s14-eu5.startpage.com/cgi-bin/serveimage?url=https%3A%2F%2Fi.ytimg.com%2Fvi%2FwUk5IwvV7ac%2Fmaxresdefault.jpg&sp=b4334087ad66c208042d259078ffc6a6'>Patrick Troughton </a>";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "<a href='https://s14-eu5.startpage.com/cgi-bin/serveimage?url=https%3A%2F%2Fi1.wp.com%2Fmetro.co.uk%2Fwp-content%2Fuploads%2F2013%2F10%2Fad_117106795.jpg%3Fquality%3D90%26amp%3Bstrip%3Dall%26amp%3Bzoom%3D1%26amp%3Bresize%3D644%252C951&sp=b502a9cde32154d4799ccb4826d47947'>Jon Pertwee </a>";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "<a href='https://s14-eu5.startpage.com/cgi-bin/serveimage?url=https%3A%2F%2Fpbs.twimg.com%2Fmedia%2FDxNkYLFX4AES8hv.jpg&sp=b08df0da6c91b891296eddcc1576b1b7'>Tom Baker </a>";
	}

}
