/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.idempiere.webservices.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for WS_WebServiceTypeAccess
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="WS_WebServiceTypeAccess")
public class X_WS_WebServiceTypeAccess extends PO implements I_WS_WebServiceTypeAccess, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20231222L;

    /** Standard Constructor */
    public X_WS_WebServiceTypeAccess (Properties ctx, int WS_WebServiceTypeAccess_ID, String trxName)
    {
      super (ctx, WS_WebServiceTypeAccess_ID, trxName);
      /** if (WS_WebServiceTypeAccess_ID == 0)
        {
			setAD_Role_ID (0);
			setIsReadWrite (true);
// Y
			setWS_WebServiceType_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_WS_WebServiceTypeAccess (Properties ctx, int WS_WebServiceTypeAccess_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, WS_WebServiceTypeAccess_ID, trxName, virtualColumns);
      /** if (WS_WebServiceTypeAccess_ID == 0)
        {
			setAD_Role_ID (0);
			setIsReadWrite (true);
// Y
			setWS_WebServiceType_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_WS_WebServiceTypeAccess (Properties ctx, String WS_WebServiceTypeAccess_UU, String trxName)
    {
      super (ctx, WS_WebServiceTypeAccess_UU, trxName);
      /** if (WS_WebServiceTypeAccess_UU == null)
        {
			setAD_Role_ID (0);
			setIsReadWrite (true);
// Y
			setWS_WebServiceType_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_WS_WebServiceTypeAccess (Properties ctx, String WS_WebServiceTypeAccess_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, WS_WebServiceTypeAccess_UU, trxName, virtualColumns);
      /** if (WS_WebServiceTypeAccess_UU == null)
        {
			setAD_Role_ID (0);
			setIsReadWrite (true);
// Y
			setWS_WebServiceType_ID (0);
        } */
    }

    /** Load Constructor */
    public X_WS_WebServiceTypeAccess (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_WS_WebServiceTypeAccess[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Role getAD_Role() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Role)MTable.get(getCtx(), org.compiere.model.I_AD_Role.Table_ID)
			.getPO(getAD_Role_ID(), get_TrxName());
	}

	/** Set Role.
		@param AD_Role_ID Responsibility Role
	*/
	public void setAD_Role_ID (int AD_Role_ID)
	{
		if (AD_Role_ID < 0)
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
	}

	/** Get Role.
		@return Responsibility Role
	  */
	public int getAD_Role_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Read Write.
		@param IsReadWrite Field is read / write
	*/
	public void setIsReadWrite (boolean IsReadWrite)
	{
		set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
	}

	/** Get Read Write.
		@return Field is read / write
	  */
	public boolean isReadWrite()
	{
		Object oo = get_Value(COLUMNNAME_IsReadWrite);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set WS_WebServiceTypeAccess_UU.
		@param WS_WebServiceTypeAccess_UU WS_WebServiceTypeAccess_UU
	*/
	public void setWS_WebServiceTypeAccess_UU (String WS_WebServiceTypeAccess_UU)
	{
		set_Value (COLUMNNAME_WS_WebServiceTypeAccess_UU, WS_WebServiceTypeAccess_UU);
	}

	/** Get WS_WebServiceTypeAccess_UU.
		@return WS_WebServiceTypeAccess_UU	  */
	public String getWS_WebServiceTypeAccess_UU()
	{
		return (String)get_Value(COLUMNNAME_WS_WebServiceTypeAccess_UU);
	}

	public I_WS_WebServiceType getWS_WebServiceType() throws RuntimeException
	{
		return (I_WS_WebServiceType)MTable.get(getCtx(), I_WS_WebServiceType.Table_ID)
			.getPO(getWS_WebServiceType_ID(), get_TrxName());
	}

	/** Set Web Service Type.
		@param WS_WebServiceType_ID Web Service Type
	*/
	public void setWS_WebServiceType_ID (int WS_WebServiceType_ID)
	{
		if (WS_WebServiceType_ID < 1)
			set_ValueNoCheck (COLUMNNAME_WS_WebServiceType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_WS_WebServiceType_ID, Integer.valueOf(WS_WebServiceType_ID));
	}

	/** Get Web Service Type.
		@return Web Service Type	  */
	public int getWS_WebServiceType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_WS_WebServiceType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}