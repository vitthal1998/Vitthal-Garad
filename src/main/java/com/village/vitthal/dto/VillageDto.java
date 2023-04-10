/**
 * Created By Vitthal Garad
 * Date:23-03-2023
 * Time:16:23
 * Project Name:village-CRUD-App
 */


package com.village.vitthal.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@AllArgsConstructor
public class VillageDto {
	@NotNull(message = "user must be not black enter user name")
	private String name;
	private String taluka;
	private String district;
	private long population;

}
