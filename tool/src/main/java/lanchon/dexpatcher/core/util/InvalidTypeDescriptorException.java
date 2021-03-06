/*
 * DexPatcher - Copyright 2015-2020 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * DexPatcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.dexpatcher.core.util;

import lanchon.dexpatcher.core.PatchException;

public class InvalidTypeDescriptorException extends PatchException {

	protected final String descriptorType;
	protected final String descriptor;

	public InvalidTypeDescriptorException(String descriptorType, String descriptor) {
		super("Invalid " + descriptorType + " type descriptor (" + descriptor + ")");
		this.descriptorType = descriptorType;
		this.descriptor = descriptor;
	}

	public String getDescriptorType() {
		return descriptorType;
	}

	public String getDescriptor() {
		return descriptor;
	}

}
