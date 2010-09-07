/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.test.content.managers;


import fede.workspace.eclipse.content.ProjectContentManager;
import fede.workspace.eclipse.java.manager.JavaProjectContentManager;
import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.cadseg.managers.dataModel.ItemManager;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
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

	/**
		get a link 'contents' from 'ItemJP' to 'ContentItem'.
		@generated
	*/
	static public Link getContentsLink(Item itemJP) {
		return itemJP.getOutgoingLink(TestContentCST.ITEM_JP_lt_CONTENTS);
	}

	/**
		get all link destination 'contents' from 'ItemJP' to 'ContentItem'.
		@generated
	*/
	static public Item getContentsAll(Item itemJP) {
		return itemJP.getOutgoingItem(TestContentCST.ITEM_JP_lt_CONTENTS, false);
	}

	/**
		get resolved link destination 'contents' from 'ItemJP' to 'ContentItem'.
		@generated
	*/
	static public Item getContents(Item itemJP) {
		return itemJP.getOutgoingItem(TestContentCST.ITEM_JP_lt_CONTENTS, true);
	}

	/**
		set a link 'contents' from 'ItemJP' to 'ContentItem'.
		@generated
	*/
	static public void setContents(Item itemJP, Item value) throws CadseException {
		itemJP.setOutgoingItem(TestContentCST.ITEM_JP_lt_CONTENTS,value);
	}

}

