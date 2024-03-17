package com.loc.newsapp.domain.repository

import androidx.paging.PagingData
import com.loc.newsapp.domain.model.Article
import com.loc.newsapp.domain.usecases.news.UpsertArticle
import com.loc.newsapp.presentation.search.SearchEvent
import kotlinx.coroutines.flow.Flow


interface NewsRepository {
    fun getNews(sources:List<String>): Flow<PagingData<Article>>

    fun searchNews(searchQuery: String, sources:List<String>): Flow<PagingData<Article>>

    suspend fun upsertArticle(article: Article)

    suspend fun deleteArticle(article: Article)

    fun  selectArticles():Flow<List<Article>>

    suspend fun selectArticle(url:String):Article?
}