package org.eclipse.imp.prefspecs.pageinfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.imp.preferences.IPreferencesService;

public class VirtualFieldInfo
{
	/**
	 * The preferences page with which this virtual field
	 * is associated
	 */
	protected PreferencesPageInfo parentPage = null;
	
	/**
	 * The name of the virtual field
	 */
	protected String name = null;
	
	
	/**
	 * Whether concrete instances of this field be edited by default
	 */
	protected boolean isEditable = true;
	
	/**
	 * Whether concrete instances of this field be removed by default
	 */
	protected boolean isRemovable = false;


	/**
	 * Whether concrete instances of this field have a "special" value
	 * (may not apply to some field types in practice)
	 */
	protected boolean hasSpecialValue = false;

	
	/**
	 * Whether this field is enabled conditionally based on another
	 * (boolean) field
	 */
	protected boolean isConditional = false;
	

	/**
	 * Whether this field, if isConditional, is is enabled when the
	 * condition field is true (if false implies that this field is
	 * enabled when the condition field is false)
	 */	
	protected boolean conditionalWith = true;
	
	
	/**
	 * The boolean field based on which this field is enabled (or not),
	 * if isConditional and depending on conditionalWith
	 */
	protected VirtualBooleanFieldInfo conditionField = null;
	
	
	/**
	 * List of concrete fields that are based on this virtual field
	 */
	List concreteFieldInfos = new ArrayList();
	
	
	
	public VirtualFieldInfo(PreferencesPageInfo parentPage, String name)
	{
		// All VirtualFieldInfos must have a parentPageInfo
		if (parentPage == null) {
			throw new IllegalArgumentException(
				"VirtualFieldInfo(..):  parent page is null; not allowed");		
		}
		
		// All VirtualFieldInfos must have a non-null name
		if (name == null) {
			throw new IllegalArgumentException(
				"PreferencesIabInfo(..):  name is null; not allowed");		
		}

		// Don't worry about other conditions, such as uniqueness of field
		// name within page; may be checked before or after this point
		
		// Okay
		this.parentPage = parentPage;
		this.name = name;
		parentPage.addVirtualFieldInfo(this);
	}
	
	
	// TODO:  Consider adding other constructors to enable attribute values to be set
	
	//
	// Name is only defined through the constuctor,
	// so only "get" methods are defined for those
	//
	
	public PreferencesPageInfo getParentPage() {
		return parentPage;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void addConcreteFieldInfo(ConcreteFieldInfo cFieldInfo) {
		concreteFieldInfos.add(cFieldInfo);
	}
	
	
	public Iterator getConcreteFieldInfos() {
		return concreteFieldInfos.iterator();
	}
	
	
	
	public boolean getIsEditable() {
		return 	isEditable;
	}
	
	public void setIsEditable(boolean isEditable) {
		this.isEditable = isEditable	;
	}


	/**
	 * Whether the values of fields on this tab can, by default, be
	 * removed.  Removal of a field value on one tab triggers inheritance
	 * of the value from the corresponding field on the next higher level.
	 * Individual fields may override this setting, except that it is
	 * always false on the default tab (from which there is no higher tab).
	 * 
	 * @return	False for the default tab; the set value of isUsed otherwise
	 */
	public boolean getIsRemovable() {
		if (getName().equals(IPreferencesService.DEFAULT_LEVEL))
			return false;
		return isRemovable;
	}
	
	
	/**
	 * Constraint:  For the default tab "isRemovable" must be false
	 * 
	 * @param isRemovable
	 */
	public void setIsRemovable(boolean isRemovable) {
		if (getName().equals(IPreferencesService.DEFAULT_LEVEL))
			if (isRemovable) {
				throw new IllegalArgumentException(
					"PreferenceIabInfo.setIsRemovable(..):  cannot set isRemovable ");
			}
		this.isRemovable = isRemovable;
	}
	
	
	
	public boolean getHasSpecialValue() {
		return 	hasSpecialValue;
	}
	
	public void setHasSpecialValue(boolean hasSpecialValue) {
		this.hasSpecialValue = hasSpecialValue;
	}
	

	
	public boolean getIsConditional() {
		return isConditional;
	}
	
	public void setIsConditional(boolean b) {
		isConditional = b;
	}
	
	
	public boolean getConditionalWith() {
		return conditionalWith;
	}
	
	public void setConditionalWith(boolean b) {
		conditionalWith = b;
	}
	
	
	public VirtualBooleanFieldInfo getConditionField() {
		return conditionField;
	}
	
	public void setConditionField(VirtualBooleanFieldInfo vbf) {
		conditionField = vbf;
	}
	

	//
	// For reporting on the contents of the field
	//
	
	public void dump(String prefix) {
		String indent = prefix + "  ";
		System.out.println(prefix + "Field '" + getName() + "'");
		System.out.println(indent + "parent page = " + getParentPage().getPageName());
		System.out.println(indent + "isEditable  = " + isEditable);
		System.out.println(indent + "isRemovable = " + isRemovable);
		if (isConditional) {
			System.out.println(indent + "isConditional " + (conditionalWith ? "with" : "against") + " " + conditionField.getName());
		} else {
			System.out.println(indent + "isConditional  = false");
		}
	}
	
}
