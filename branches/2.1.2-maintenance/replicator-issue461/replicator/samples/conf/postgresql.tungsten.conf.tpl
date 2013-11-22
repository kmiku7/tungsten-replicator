# Archive mode commands.  These are included at end of postgresql.conf. 

# Turn on archiving. 
archive_mode = on

# Specify archive command. 
archive_command = ''

# Specify archive timeout in seconds.  0 disables. 
archive_timeout = 60

# More than 0 enables streaming replication sender on the master.
#max_wal_senders = 100

# Determines how much information is written to the WAL.
#wal_level = 'hot_standby'

# Specifies whether or not you can run queries during recovery. Default is off.
#hot_standby = on