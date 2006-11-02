/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.designer.core.model.utils.emf.talendfile.ColumnType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#isKey <em>Key</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnTypeImpl extends EObjectImpl implements ColumnType {
    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKey()
     * @generated
     * @ordered
     */
    protected static final boolean KEY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKey()
     * @generated
     * @ordered
     */
    protected boolean key = KEY_EDEFAULT;

    /**
     * This is true if the Key attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keyESet = false;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final int LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected int length = LENGTH_EDEFAULT;

    /**
     * This is true if the Length attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lengthESet = false;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected static final boolean NULLABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected boolean nullable = NULLABLE_EDEFAULT;

    /**
     * This is true if the Nullable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nullableESet = false;

    /**
     * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected static final int PRECISION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected int precision = PRECISION_EDEFAULT;

    /**
     * This is true if the Precision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean precisionESet = false;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ColumnTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.COLUMN_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComment(String newComment) {
        String oldComment = comment;
        comment = newComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(boolean newKey) {
        boolean oldKey = key;
        key = newKey;
        boolean oldKeyESet = keyESet;
        keyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__KEY, oldKey, key, !oldKeyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetKey() {
        boolean oldKey = key;
        boolean oldKeyESet = keyESet;
        key = KEY_EDEFAULT;
        keyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__KEY, oldKey, KEY_EDEFAULT, oldKeyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetKey() {
        return keyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        boolean oldLengthESet = lengthESet;
        lengthESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__LENGTH, oldLength, length, !oldLengthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLength() {
        int oldLength = length;
        boolean oldLengthESet = lengthESet;
        length = LENGTH_EDEFAULT;
        lengthESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLength() {
        return lengthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNullable(boolean newNullable) {
        boolean oldNullable = nullable;
        nullable = newNullable;
        boolean oldNullableESet = nullableESet;
        nullableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__NULLABLE, oldNullable, nullable, !oldNullableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNullable() {
        boolean oldNullable = nullable;
        boolean oldNullableESet = nullableESet;
        nullable = NULLABLE_EDEFAULT;
        nullableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__NULLABLE, oldNullable, NULLABLE_EDEFAULT, oldNullableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNullable() {
        return nullableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrecision(int newPrecision) {
        int oldPrecision = precision;
        precision = newPrecision;
        boolean oldPrecisionESet = precisionESet;
        precisionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__PRECISION, oldPrecision, precision, !oldPrecisionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPrecision() {
        int oldPrecision = precision;
        boolean oldPrecisionESet = precisionESet;
        precision = PRECISION_EDEFAULT;
        precisionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__PRECISION, oldPrecision, PRECISION_EDEFAULT, oldPrecisionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPrecision() {
        return precisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                return getComment();
            case TalendFilePackage.COLUMN_TYPE__KEY:
                return isKey() ? Boolean.TRUE : Boolean.FALSE;
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                return new Integer(getLength());
            case TalendFilePackage.COLUMN_TYPE__NAME:
                return getName();
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                return isNullable() ? Boolean.TRUE : Boolean.FALSE;
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                return new Integer(getPrecision());
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                return getType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                setComment((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__KEY:
                setKey(((Boolean)newValue).booleanValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                setLength(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__NAME:
                setName((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                setNullable(((Boolean)newValue).booleanValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                setPrecision(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                setType((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__KEY:
                unsetKey();
                return;
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                unsetLength();
                return;
            case TalendFilePackage.COLUMN_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                unsetNullable();
                return;
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                unsetPrecision();
                return;
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case TalendFilePackage.COLUMN_TYPE__KEY:
                return isSetKey();
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                return isSetLength();
            case TalendFilePackage.COLUMN_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                return isSetNullable();
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                return isSetPrecision();
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (comment: ");
        result.append(comment);
        result.append(", key: ");
        if (keyESet) result.append(key); else result.append("<unset>");
        result.append(", length: ");
        if (lengthESet) result.append(length); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", nullable: ");
        if (nullableESet) result.append(nullable); else result.append("<unset>");
        result.append(", precision: ");
        if (precisionESet) result.append(precision); else result.append("<unset>");
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //ColumnTypeImpl