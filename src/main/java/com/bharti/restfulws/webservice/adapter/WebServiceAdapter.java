package com.bharti.restfulws.webservice.adapter;

public interface WebServiceAdapter<XmlObj, BaseDomainObject> {
	void toXmlBean(Object xmlObj, BaseDomainObject domainObject);
	BaseDomainObject toDomainObject(XmlObj xmlObj);
}
