package com.example.superheroesapp.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.R
import com.example.superheroesapp.model.Hero
import com.example.superheroesapp.ui.theme.SuperheroesAppTheme
import kotlinx.coroutines.MainScope

@Composable
internal fun HeroItem (
    hero: Hero,
    modifier: Modifier
){
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.tertiaryContainer
        )
        ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .height(72.dp)

        ) {
            HeroInfo(
                hero.nameResId,
                hero.descriptionId,
                modifier = Modifier.weight(1f))
            Spacer(modifier = Modifier.width(16.dp))
            HeroIcon(
                hero.imageResId,
                modifier = Modifier
                    .size(72.dp)
                    .clip(MaterialTheme.shapes.small)
                )
        }
    }
}


@Composable
private fun HeroInfo (
    heroName: Int,
    heroDescription: Int,
    modifier: Modifier = Modifier,
){
    Column (modifier) {
        Text(
            text = stringResource(heroName),
            style = MaterialTheme.typography.displaySmall
        )
        Text(
            text = stringResource(heroDescription),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
private fun HeroIcon (
    heroIcon: Int,
    modifier: Modifier = Modifier
){
    Box(modifier) {
        Image(
            painter = painterResource(heroIcon),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier,
        )
    }
}


//@Preview
//@Composable
//private fun HeroItemPreview(){
//    SuperheroesAppTheme {
//        HeroItem()
//    }
//}