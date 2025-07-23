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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.R
import com.example.superheroesapp.ui.theme.SuperheroesAppTheme

@Composable
internal fun HeroCard (
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
        HeroCard()
    }
}