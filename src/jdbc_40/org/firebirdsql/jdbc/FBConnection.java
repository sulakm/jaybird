/*
 * Firebird Open Source J2ee connector - jdbc driver
 *
 * Distributable under LGPL license.
 * You may obtain a copy of the License at http://www.gnu.org/copyleft/lgpl.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * LGPL License for more details.
 *
 * This file was created by members of the firebird development team.
 * All individual contributions remain the Copyright (C) of those
 * individuals.  Contributors to this file are either listed here or
 * can be obtained from a CVS history command.
 *
 * All rights reserved.
 */
package org.firebirdsql.jdbc;

import java.sql.*;
import java.util.Properties;

import org.firebirdsql.gds.GDS;
import org.firebirdsql.gds.GDSException;
import org.firebirdsql.gds.ISCConstants;
import org.firebirdsql.jca.FBManagedConnection;

/**
 * Firebird connection class implementing JDBC 3.0 methods.
 * 
 * @author <a href="mailto:rrokytskyy@users.sourceforge.net">Roman Rokytskyy</a>
 */
public class FBConnection extends AbstractConnection {

    /**
     * Create instance of this class for the specified managed connection.
     * 
     * @param mc
     *            managed connection.
     */
    public FBConnection(FBManagedConnection mc) {
        super(mc);
    }

    /**
     * Creates a default <code>PreparedStatement</code> object that has the
     * capability to retrieve auto-generated keys. The given constant tells the
     * driver whether it should make auto-generated keys available for
     * retrieval. This parameter is ignored if the SQL statement is not an
     * <code>INSERT</code> statement.
     * <P>
     * <B>Note:</B> This method is optimized for handling parametric SQL
     * statements that benefit from precompilation. If the driver supports
     * precompilation, the method <code>prepareStatement</code> will send the
     * statement to the database for precompilation. Some drivers may not
     * support precompilation. In this case, the statement may not be sent to
     * the database until the <code>PreparedStatement</code> object is
     * executed. This has no direct effect on users; however, it does affect
     * which methods throw certain SQLExceptions.
     * <P>
     * Result sets created using the returned <code>PreparedStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code> and have
     * a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * 
     * @param sql
     *            an SQL statement that may contain one or more '?' IN parameter
     *            placeholders
     * 
     * @param autoGeneratedKeys
     *            a flag indicating whether auto-generated keys should be
     *            returned; one of <code>Statement.RETURN_GENERATED_KEYS</code>
     *            or <code>Statement.NO_GENERATED_KEYS</code>
     * 
     * @return a new <code>PreparedStatement</code> object, containing the
     *         pre-compiled SQL statement, that will have the capability of
     *         returning auto-generated keys
     * 
     * @exception SQLException
     *                if a database access error occurs or the given parameter
     *                is not a <code>Statement</code> constant indicating
     *                whether auto-generated keys should be returned
     */
//    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
//            throws SQLException {
//        throw new FBDriverNotCapableException();
//    }

    /**
     * Creates a default <code>PreparedStatement</code> object capable of
     * returning the auto-generated keys designated by the given array. This
     * array contains the indexes of the columns in the target table that
     * contain the auto-generated keys that should be made available. This array
     * is ignored if the SQL statement is not an <code>INSERT</code>
     * statement.
     * <P>
     * An SQL statement with or without IN parameters can be pre-compiled and
     * stored in a <code>PreparedStatement</code> object. This object can then
     * be used to efficiently execute this statement multiple times.
     * <P>
     * <B>Note:</B> This method is optimized for handling parametric SQL
     * statements that benefit from precompilation. If the driver supports
     * precompilation, the method <code>prepareStatement</code> will send the
     * statement to the database for precompilation. Some drivers may not
     * support precompilation. In this case, the statement may not be sent to
     * the database until the <code>PreparedStatement</code> object is
     * executed. This has no direct effect on users; however, it does affect
     * which methods throw certain SQLExceptions.
     * <P>
     * Result sets created using the returned <code>PreparedStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code> and have
     * a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * 
     * @param sql
     *            an SQL statement that may contain one or more '?' IN parameter
     *            placeholders
     * 
     * @param columnIndexes
     *            an array of column indexes indicating the columns that should
     *            be returned from the inserted row or rows
     * 
     * @return a new <code>PreparedStatement</code> object, containing the
     *         pre-compiled statement, that is capable of returning the
     *         auto-generated keys designated by the given array of column
     *         indexes
     * 
     * @exception SQLException
     *                if a database access error occurs
     */
//    public PreparedStatement prepareStatement(String sql, int columnIndexes[])
//            throws SQLException {
//        throw new FBDriverNotCapableException();
//    }

    /**
     * Creates a default <code>PreparedStatement</code> object capable of
     * returning the auto-generated keys designated by the given array. This
     * array contains the names of the columns in the target table that contain
     * the auto-generated keys that should be returned. This array is ignored if
     * the SQL statement is not an <code>INSERT</code> statement.
     * <P>
     * An SQL statement with or without IN parameters can be pre-compiled and
     * stored in a <code>PreparedStatement</code> object. This object can then
     * be used to efficiently execute this statement multiple times.
     * <P>
     * <B>Note:</B> This method is optimized for handling parametric SQL
     * statements that benefit from precompilation. If the driver supports
     * precompilation, the method <code>prepareStatement</code> will send the
     * statement to the database for precompilation. Some drivers may not
     * support precompilation. In this case, the statement may not be sent to
     * the database until the <code>PreparedStatement</code> object is
     * executed. This has no direct effect on users; however, it does affect
     * which methods throw certain SQLExceptions.
     * <P>
     * Result sets created using the returned <code>PreparedStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code> and have
     * a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * 
     * @param sql
     *            an SQL statement that may contain one or more '?' IN parameter
     *            placeholders
     *            
     * @param columnNames
     *            an array of column names indicating the columns that should be
     *            returned from the inserted row or rows
     *            
     * @return a new <code>PreparedStatement</code> object, containing the
     *         pre-compiled statement, that is capable of returning the
     *         auto-generated keys designated by the given array of column names
     *         
     * @exception SQLException
     *                if a database access error occurs
     */
//    public PreparedStatement prepareStatement(String sql, String columnNames[])
//            throws SQLException {
//        throw new FBDriverNotCapableException();
//    }

    /**
     * Creates an unnamed savepoint in the current transaction and 
     * returns the new <code>Savepoint</code> object that represents it.
     *
     * @return the new <code>Savepoint</code> object
     * @exception SQLException if a database access error occurs
     *            or this <code>Connection</code> object is currently in
     *            auto-commit mode
     * @see Savepoint
     * @since 1.4
     */
    public Savepoint setSavepoint() throws SQLException {
        return (Savepoint)setFirebirdSavepoint();
    }

    /**
     * Creates a savepoint with the given name in the current transaction
     * and returns the new <code>Savepoint</code> object that represents it.
     *
     * @param name a <code>String</code> containing the name of the savepoint
     * @return the new <code>Savepoint</code> object
     * @exception SQLException if a database access error occurs
     *            or this <code>Connection</code> object is currently in
     *            auto-commit mode
     * @see Savepoint
     * @since 1.4
     */
    public Savepoint setSavepoint(String name) throws SQLException {
        return (Savepoint)setFirebirdSavepoint(name);
    }

    /**
     * Undoes all changes made after the given <code>Savepoint</code> object
     * was set. 
     * <P>
     * This method should be used only when auto-commit has been disabled.
     *
     * @param savepoint the <code>Savepoint</code> object to roll back to
     * @exception SQLException if a database access error occurs,
     *            the <code>Savepoint</code> object is no longer valid,
     *            or this <code>Connection</code> object is currently in
     *            auto-commit mode
     * @see Savepoint
     * @see #rollback
     * @since 1.4
     */
    public void rollback(Savepoint savepoint) throws SQLException {
        rollback((FirebirdSavepoint)savepoint);
    }

    /**
     * Removes the given <code>Savepoint</code> object from the current 
     * transaction. Any reference to the savepoint after it have been removed 
     * will cause an <code>SQLException</code> to be thrown.
     *
     * @param savepoint the <code>Savepoint</code> object to be removed
     * @exception SQLException if a database access error occurs or
     *            the given <code>Savepoint</code> object is not a valid 
     *            savepoint in the current transaction
     * @since 1.4
     */
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        releaseSavepoint((FirebirdSavepoint)savepoint);
    }

    // -------------------------------------------------------------------------
    // JDBC 4.0
    // -------------------------------------------------------------------------
    
    public Array createArrayOf(String typeName, Object[] elements)
            throws SQLException {
        throw new FBDriverNotCapableException();
    }

    public NClob createNClob() throws SQLException {
        throw new FBDriverNotCapableException();
    }

    public SQLXML createSQLXML() throws SQLException {
        throw new FBDriverNotCapableException();
    }

    public Struct createStruct(String typeName, Object[] attributes)
            throws SQLException {
        throw new FBDriverNotCapableException();
    }

    public boolean isValid(int timeout) throws SQLException {
    	try {
	        GDS gds = getInternalAPIHandler();
	        
	        byte[] infoRequest = new byte[] {ISCConstants.isc_info_user_names, ISCConstants.isc_info_end};
	        byte[] reply = gds.iscDatabaseInfo(getIscDBHandle(), infoRequest, 1024);
	        return true;
    	} catch(GDSException ex) {
    		return false;
    	}
    }

    // java.sql.Wrapper interface
    
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return iface != null && iface.isAssignableFrom(FBConnection.class);
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        if (!isWrapperFor(iface))
            throw new FBDriverNotCapableException();
        
        return (T)this;
    }
}
