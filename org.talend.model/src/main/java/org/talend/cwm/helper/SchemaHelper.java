// ============================================================================
//
// Copyright (C) 2006-2010 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.cwm.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.talend.cwm.relational.TdTable;
import org.talend.cwm.relational.TdView;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.resource.relational.Catalog;
import orgomg.cwm.resource.relational.Schema;

/**
 * @author scorreia
 * 
 * Utility for handling Schema.
 */
public final class SchemaHelper {

    private SchemaHelper() {
    }

    
    public static Schema createSchema(String name) {
    	Schema schema = orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSchema();
    	schema.setName(name);
        return schema;
    }
    
    public static List<Schema> getSchemas(Collection<? extends EObject> elements) {
        List<Schema> schemas = new ArrayList<Schema>();
        for (EObject modelElement : elements) {
            Schema schema = SwitchHelpers.SCHEMA_SWITCH.doSwitch(modelElement);
            if (schema != null) {
                schemas.add(schema);
            }
        }
        return schemas;
    }

    public static List<TdTable> getTables(Schema schema) {
        // MOD xqliu 2009-04-27 bug 6507
        // TaggedValue tv = TaggedValueHelper.getTaggedValue(TaggedValueHelper.TABLE_FILTER, schema.getTaggedValue());
        // String tableFilter = tv == null ? null : tv.getValue();
        // return TableHelper.getTables(schema.getOwnedElement(), tableFilter);
        // ~
        return TableHelper.getTables(schema.getOwnedElement());
    }

    public static List<TdView> getViews(Schema schema) {
        // MOD xqliu 2009-04-27 bug 6507
        // TaggedValue tv = TaggedValueHelper.getTaggedValue(TaggedValueHelper.VIEW_FILTER, schema.getTaggedValue());
        // String viewFilter = tv == null ? null : tv.getValue();
        // return ViewHelper.getViews(schema.getOwnedElement(), viewFilter);
        // ~
        return ViewHelper.getViews(schema.getOwnedElement());
    }

    public static boolean addTables(Collection<TdTable> tables, Schema schema) {
        return schema.getOwnedElement().addAll(tables);
    }

    public static boolean addViews(Collection<TdView> views, Schema schema) {
        return schema.getOwnedElement().addAll(views);
    }

    /**
     * Method "getParentSchema" returns a schema if the element is directly owned by a schema.
     * 
     * @param element (can be null)
     * @return the Catalog or null
     */
    public static Schema getParentSchema(ModelElement element) {
        if (element == null) {
            return null;
        }
        final Namespace namespace = element.getNamespace();
        return (namespace != null) ? SwitchHelpers.SCHEMA_SWITCH.doSwitch(namespace) : null;
    }

}
