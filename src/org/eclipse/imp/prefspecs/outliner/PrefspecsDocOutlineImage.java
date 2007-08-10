package org.eclipse.imp.prefspecs.outliner;

import org.eclipse.imp.services.IOutlineImage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

//public class PrefspecsImages {
	
public class PrefspecsDocOutlineImage implements IOutlineImage
{
	private PrefspecsDocOutlineImage() { }
	
	private static PrefspecsDocOutlineImage image = null;
	
	public static PrefspecsDocOutlineImage getPrefspecsDocOutlineImage() {
		if (image == null) {
			image = new PrefspecsDocOutlineImage();
		}
		return image;
	}
	
	public static final String IMAGE_ROOT= "icons";
	
	//public static ImageDescriptor OUTLINE_ITEM_DESC= AbstractUIPlugin.imageDescriptorFromPlugin("prefspecs", IMAGE_ROOT + "/doc_outline_item.gif");
	public static ImageDescriptor OUTLINE_ITEM_DESC= AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.imp.prefspecs", IMAGE_ROOT + "/doc_outline_item.gif");

	public static Image OUTLINE_ITEM_IMAGE= OUTLINE_ITEM_DESC.createImage();

	
	public String getImageRoot() {
		return IMAGE_ROOT;
	}

	public ImageDescriptor getOutlineItemDesc() {
		return OUTLINE_ITEM_DESC;
	}

	public Image getOutlineItemImage() {
		return OUTLINE_ITEM_IMAGE;
	}

	
}
