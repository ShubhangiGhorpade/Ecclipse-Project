package com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.policeStation.constatnt.CellNum;

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	@Min(value = 1, message = "id must be greater than 1")
	@Max(value = 100, message = "id must be greater than 100")
	private int id;

	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20)
	private String name;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20)
	private String area;
	//@Min(value = 1)
	//@Max(value = 100)
	private CellNum noOfCell;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20)
	private String inspectorName;

	public PoliceStationDTO() {

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public CellNum getNoOfCell() {
		return noOfCell;
	}

	public String getInspectorName() {
		return inspectorName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setNoOfCell(CellNum noOfCell) {
		this.noOfCell = noOfCell;
	}

	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, id, inspectorName, name, noOfCell);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PoliceStationDTO)) {
			return false;
		}
		PoliceStationDTO other = (PoliceStationDTO) obj;
		return Objects.equals(area, other.area) && id == other.id && Objects.equals(inspectorName, other.inspectorName)
				&& Objects.equals(name, other.name) && noOfCell == other.noOfCell;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", area=" + area + ", noOfCell=" + noOfCell
				+ ", inspectorName=" + inspectorName + "]";
	}

	public PoliceStationDTO(int id, String name, String area, CellNum noOfCell, String inspectorName) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.noOfCell = noOfCell;
		this.inspectorName = inspectorName;
	}

	@Override
	public int compareTo(PoliceStationDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
