/*
 * $Id$
 * 
 * Firebird Open Source J2EE Connector - JDBC Driver
 * 
 * Copyright (C) All Rights Reserved.
 * 
 * This file was created by members of the firebird development team.
 * All individual contributions remain the Copyright (C) of those
 * individuals.  Contributors to this file are either listed here or
 * can be obtained from a CVS history command.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *  
 *   - Redistributions of source code must retain the above copyright 
 *     notice, this list of conditions and the following disclaimer.
 *   - Redistributions in binary form must reproduce the above 
 *     copyright notice, this list of conditions and the following 
 *     disclaimer in the documentation and/or other materials provided 
 *     with the distribution.
 *   - Neither the name of the firebird development team nor the names
 *     of its contributors may be used to endorse or promote products 
 *     derived from this software without specific prior written 
 *     permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS 
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE 
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS 
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED 
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT 
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF 
 * SUCH DAMAGE.
 */
package org.firebirdsql.management;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Implements the backup and restore functionality of Firebird Services API.
 * 
 * @author <a href="mailto:rrokytskyy@users.sourceforge.net">Roman Rokytskyy</a>
 * @author <a href="mailto:sjardine@users.sourceforge.net">Steven Jardine</a>
 */
public interface BackupManager extends ServiceManager {

    /**
     * Returns the location of the backup file.
     * @return the location of the backup file.
     */
    public String getBackupPath();

    /**
     * Sets the location of the backup file.
     * @param backupPath the location of the backup file.
     */
    public void setBackupPath(String backupPath);

    /**
     * Perform the backup operation.
     * @param verbose output to the logger.
     * @throws SQLException
     * @throws IOException
     */
    public void backupDatabase(boolean verbose) throws SQLException,
            IOException;

    /**
     * Perform the backup operation, metadata only.
     * @param verbose output to the logger.
     * @throws SQLException
     * @throws IOException
     */
    public void backupMetadata(boolean verbose) throws SQLException,
            IOException;

    /**
     * Perform the backup operation.
     * @param options for the backup operation
     * @param verbose output to the logger.
     * @throws SQLException
     * @throws IOException
     */
    public void backupDatabase(int options, boolean verbose)
            throws SQLException, IOException;

    /**
     * Perform the restore operation.
     * @param  verbose output to the logger.
     * @throws SQLException
     * @throws IOException
     */
    public void restoreDatabase(boolean verbose) throws SQLException,
            IOException;

    /**
     * Perform the restore operation.
     * @param buffers 
     * @param pageSize
     * @param restoreReadOnly
     * @param options
     * @param verbose
     * @throws SQLException
     * @throws IOException
     */
    public void restoreDatabase(int buffers, int pageSize,
            boolean restoreReadOnly, int options, boolean verbose)
            throws SQLException, IOException;
}