package io.cloudsoft.winrm4j.service.enumerate;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Items {

	@XmlAnyElement(lax = true)
	protected List<Object> value;

	public List<Object> getValue() {
		return value;
	}

	public void setValue(final List<Object> value) {
		this.value = value;
	}
}
