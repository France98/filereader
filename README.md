FileReader Task by Phanuwatch Luangpradit
-----------------------------------------------
I ran the tasks on Msi GP62 QF Leopard pro with Core i5-6300HQ CPU @2.30GHz, and got these results:

Task				     |Time
-------------------------------------|---------:
Read file 1-char at a time to String |0.880825 sec
Read file 1-char at a time to StringBuilder | 0.004128 sec
Read file line at a time using BufferedReader | 0.026799 sec

## Explanation of results
----------------------------------------------
 - Append using String is the slowest because it will create a new String everytime.
 - Append using StringBuilder is the fastest because it append the char into the array the StringBuilder create.
 - Append String by using BufferedReader is faster than String but slower than StringBuilder.