package org.example.Solution41;

import java.util.Collections;
import java.util.List;

public class SortNames
{
    public List<String> sortNameList(List<String> nameList)
    {
        //Loop dynamically using namelist size to sort names with built-in method.
        for(int i = 0; i < nameList.size(); i++)
        {
            Collections.sort(nameList);
        }

        //returns sorted list.
        return nameList;
    }

}
