package com.acadview.recyclerview3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Contact> lstContact;

    public FragmentContact() {

        View v;

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Nishu"," 9187509654",R.drawable.a));
        lstContact.add(new Contact("Mansu"," 9166743678",R.drawable.b));
        lstContact.add(new Contact("Malika"," 9185671294",R.drawable.c));
        lstContact.add(new Contact("Niti"," 91098765434",R.drawable.d));
        lstContact.add(new Contact("Abhi"," 91457298764",R.drawable.e));
        lstContact.add(new Contact("Raman"," 9199509654",R.drawable.f));
        lstContact.add(new Contact("Ravi"," 9175009654",R.drawable.g));
        lstContact.add(new Contact("Hari"," 9171709654",R.drawable.h));
        lstContact.add(new Contact("Love"," 9199909654",R.drawable.i));
        lstContact.add(new Contact("Nishu"," 9187509654",R.drawable.a));
        lstContact.add(new Contact("Mansu"," 9166743678",R.drawable.b));
        lstContact.add(new Contact("Malika"," 9185671294",R.drawable.c));
        lstContact.add(new Contact("Niti"," 91098765434",R.drawable.d));
        lstContact.add(new Contact("Abhi"," 91457298764",R.drawable.e));
        lstContact.add(new Contact("Raman"," 9199509654",R.drawable.f));
        lstContact.add(new Contact("Ravi"," 9175009654",R.drawable.g));
        lstContact.add(new Contact("Hari"," 9171709654",R.drawable.h));
        lstContact.add(new Contact("Love"," 9199909654",R.drawable.i));

    }
}
