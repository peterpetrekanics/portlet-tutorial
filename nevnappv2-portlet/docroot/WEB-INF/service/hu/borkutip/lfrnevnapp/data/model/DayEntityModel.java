/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package hu.borkutip.lfrnevnapp.data.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DayEntity service. Represents a row in the &quot;nevnapp_DayEntity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link hu.borkutip.lfrnevnapp.data.model.impl.DayEntityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link hu.borkutip.lfrnevnapp.data.model.impl.DayEntityImpl}.
 * </p>
 *
 * @author Péter Borkuti
 * @see DayEntity
 * @see hu.borkutip.lfrnevnapp.data.model.impl.DayEntityImpl
 * @see hu.borkutip.lfrnevnapp.data.model.impl.DayEntityModelImpl
 * @generated
 */
public interface DayEntityModel extends BaseModel<DayEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a day entity model instance should use the {@link DayEntity} interface instead.
	 */

	/**
	 * Returns the primary key of this day entity.
	 *
	 * @return the primary key of this day entity
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this day entity.
	 *
	 * @param primaryKey the primary key of this day entity
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the day ID of this day entity.
	 *
	 * @return the day ID of this day entity
	 */
	public long getDayId();

	/**
	 * Sets the day ID of this day entity.
	 *
	 * @param dayId the day ID of this day entity
	 */
	public void setDayId(long dayId);

	/**
	 * Returns the month of this day entity.
	 *
	 * @return the month of this day entity
	 */
	public int getMonth();

	/**
	 * Sets the month of this day entity.
	 *
	 * @param month the month of this day entity
	 */
	public void setMonth(int month);

	/**
	 * Returns the day of this day entity.
	 *
	 * @return the day of this day entity
	 */
	public int getDay();

	/**
	 * Sets the day of this day entity.
	 *
	 * @param day the day of this day entity
	 */
	public void setDay(int day);

	/**
	 * Returns the name ID of this day entity.
	 *
	 * @return the name ID of this day entity
	 */
	public long getNameId();

	/**
	 * Sets the name ID of this day entity.
	 *
	 * @param nameId the name ID of this day entity
	 */
	public void setNameId(long nameId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(hu.borkutip.lfrnevnapp.data.model.DayEntity dayEntity);

	@Override
	public int hashCode();

	@Override
	public CacheModel<hu.borkutip.lfrnevnapp.data.model.DayEntity> toCacheModel();

	@Override
	public hu.borkutip.lfrnevnapp.data.model.DayEntity toEscapedModel();

	@Override
	public hu.borkutip.lfrnevnapp.data.model.DayEntity toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}