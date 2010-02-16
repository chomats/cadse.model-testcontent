package fr.imag.adele.cadse.test.content.managers;


import fede.workspace.eclipse.content.ProjectContentManager;
import fede.workspace.eclipse.java.manager.JavaProjectContentManager;
import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.cadseg.managers.dataModel.ItemManager;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.content.ContentItem;
import fr.imag.adele.cadse.core.impl.var.VariableImpl;
import fr.imag.adele.cadse.core.var.ContextVariable;
import fr.imag.adele.cadse.core.var.Variable;
import fr.imag.adele.cadse.test.content.TestContentCST;
import java.util.UUID;



/**
    @generated
*/
public class ItemJPManager extends ItemManager {

	/**
	    @generated
	*/
	static final class ProjectNameVariable extends VariableImpl {

		/**
		    @generated
		*/
		public final static Variable INSTANCE = new ProjectNameVariable();

		/**
		    @generated
		*/
		public String compute(ContextVariable context, Item itemCurrent) {
			try {
				Object value;
				return context.getQualifiedName(itemCurrent);
			} catch (Throwable e) {
				e.printStackTrace();
				return "error";
			}
		}
	}

	/**
	    @generated
	*/
	public ItemJPManager() {
		super();
	}

	/**
		@generated
	*/
	@Override
	public String computeQualifiedName(Item item, String name, Item parent, LinkType lt) {
		StringBuilder sb = new StringBuilder();
		try {
			Object value;
			Item currentItem;
			if (sb.length() != 0) {
				sb.append(".");
			}
			sb.append(name);
			return sb.toString();
		} catch (Throwable e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
		@generated
	*/
	@Override
	public String getDisplayName(Item item) {
		try {
			Object value;
			return item.getName();
		} catch (Throwable e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
		@generated
	*/
	@Override
	public ContentItem createContentItem(UUID id, Item owerItem ) throws CadseException {
		JavaProjectContentManager cm = new JavaProjectContentManager(
			id, ProjectNameVariable.INSTANCE,fede.workspace.eclipse.java.JavaProjectManager.DEFAULT_SOURCES_FOLDER_NAME
			);
		owerItem.setComposers(
		);
		owerItem.setExporters(
		);
		return cm;
	}

}

