package com.luizleao.prototype2;

abstract class DocumentoPrototype implements Cloneable {
	protected DocumentoPrototype clone() {
		Object clone = null;
		try {
			clone = super.clone();
	    } catch (CloneNotSupportedException ex) {
	    		ex.printStackTrace();
	    }
	    return (DocumentoPrototype) clone;
	}
}
