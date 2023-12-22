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
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for R_CategoryUpdates
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="R_CategoryUpdates")
public class X_R_CategoryUpdates extends PO implements I_R_CategoryUpdates, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20231222L;

    /** Standard Constructor */
    public X_R_CategoryUpdates (Properties ctx, int R_CategoryUpdates_ID, String trxName)
    {
      super (ctx, R_CategoryUpdates_ID, trxName);
      /** if (R_CategoryUpdates_ID == 0)
        {
			setAD_User_ID (0);
			setIsSelfService (false);
			setR_Category_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_CategoryUpdates (Properties ctx, int R_CategoryUpdates_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, R_CategoryUpdates_ID, trxName, virtualColumns);
      /** if (R_CategoryUpdates_ID == 0)
        {
			setAD_User_ID (0);
			setIsSelfService (false);
			setR_Category_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_CategoryUpdates (Properties ctx, String R_CategoryUpdates_UU, String trxName)
    {
      super (ctx, R_CategoryUpdates_UU, trxName);
      /** if (R_CategoryUpdates_UU == null)
        {
			setAD_User_ID (0);
			setIsSelfService (false);
			setR_Category_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_CategoryUpdates (Properties ctx, String R_CategoryUpdates_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, R_CategoryUpdates_UU, trxName, virtualColumns);
      /** if (R_CategoryUpdates_UU == null)
        {
			setAD_User_ID (0);
			setIsSelfService (false);
			setR_Category_ID (0);
        } */
    }

    /** Load Constructor */
    public X_R_CategoryUpdates (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org
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
      StringBuilder sb = new StringBuilder ("X_R_CategoryUpdates[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Self-Service.
		@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service
	*/
	public void setIsSelfService (boolean IsSelfService)
	{
		set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
	}

	/** Get Self-Service.
		@return This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public boolean isSelfService()
	{
		Object oo = get_Value(COLUMNNAME_IsSelfService);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_R_Category getR_Category() throws RuntimeException
	{
		return (org.compiere.model.I_R_Category)MTable.get(getCtx(), org.compiere.model.I_R_Category.Table_ID)
			.getPO(getR_Category_ID(), get_TrxName());
	}

	/** Set Category.
		@param R_Category_ID Request Category
	*/
	public void setR_Category_ID (int R_Category_ID)
	{
		if (R_Category_ID < 1)
			set_ValueNoCheck (COLUMNNAME_R_Category_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_R_Category_ID, Integer.valueOf(R_Category_ID));
	}

	/** Get Category.
		@return Request Category
	  */
	public int getR_Category_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_Category_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set R_CategoryUpdates_UU.
		@param R_CategoryUpdates_UU R_CategoryUpdates_UU
	*/
	public void setR_CategoryUpdates_UU (String R_CategoryUpdates_UU)
	{
		set_Value (COLUMNNAME_R_CategoryUpdates_UU, R_CategoryUpdates_UU);
	}

	/** Get R_CategoryUpdates_UU.
		@return R_CategoryUpdates_UU	  */
	public String getR_CategoryUpdates_UU()
	{
		return (String)get_Value(COLUMNNAME_R_CategoryUpdates_UU);
	}
}