package com.example.terserah.di

import com.example.terserah.repository.NetworkRepositoryMhs
import com.example.terserah.repository.RepositoryMhs
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer{
    val repositoryMhs : RepositoryMhs
}

class MahasiswaContainer: AppContainer{
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    override val repositoryMhs: RepositoryMhs by lazy {
        NetworkRepositoryMhs(firestore)
    }
}