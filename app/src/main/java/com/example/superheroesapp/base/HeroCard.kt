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
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.R
import com.example.superheroesapp.model.Hero
import com.example.superheroesapp.ui.theme.SuperheroesAppTheme

@Composable
internal fun HeroCard (
    hero: Hero,
    modifier: Modifier = Modifier
){
    Card (
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimaryContainer,
            contentColor = MaterialTheme.colorScheme.tertiaryContainer
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Row (
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(72.dp)
        ) {
            HeroNameAndInfo(
                hero.nameResId,
                hero.descriptionId,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(16.dp))
            HeroIcon(hero.imageResId,)
        }
    }
}

@Composable
private fun HeroIcon(
    heroIcon: Int,
    modifier: Modifier = Modifier
){
    Image(
        modifier = modifier
            .size(72.dp)
            .clip(MaterialTheme.shapes.small),
        painter = painterResource(heroIcon),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun HeroNameAndInfo(
    heroName: Int,
    heroInfo: Int,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Text(
            text = stringResource(heroName),
            style = MaterialTheme.typography.displaySmall,
        )
        Text(
            text = stringResource(heroInfo),
            style = MaterialTheme.typography.bodyMedium,

            )
    }
}


@Composable
internal fun HeroCardForTest (
    modifier: Modifier = Modifier
){
    Card (
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(72.dp)
        ) {
            Column( modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.hero1),
                    style = MaterialTheme.typography.displaySmall,
                )
                Text(
                    text = stringResource(R.string.description1),
                    style = MaterialTheme.typography.bodyMedium,

                    )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                modifier = Modifier
                    .size(72.dp)
                    .clip(MaterialTheme.shapes.small),
                painter = painterResource(R.drawable.android_superhero1),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    }
}


@Preview ()
@Composable
private fun CardPreview(){
    SuperheroesAppTheme {
        HeroCardForTest()
    }
}