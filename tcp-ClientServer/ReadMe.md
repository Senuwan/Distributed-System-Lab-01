This project contains a simple TCP **`client server `**
which is capable of handling multiple concurrent clients.
The maximum number of clients serviceable at a give time
is decided by the **`maximumPoolSize`** parameter.

When the **maximum number of clients** are reached and 
new requested are arrived, such client request will be
____`queued for a preiod of time`____ until a thread in the
connection pool handling thread pool frees up.

**'How to run'**

execute,
First Run the Server File
then run the Client File


sh command is not added.

Here **'maximumPoolSize'** is the maximum number of concurrent connections.