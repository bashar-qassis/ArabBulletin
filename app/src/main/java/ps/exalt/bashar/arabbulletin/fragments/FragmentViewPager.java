package ps.exalt.bashar.arabbulletin.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import ps.exalt.bashar.arabbulletin.Constants;
import ps.exalt.bashar.arabbulletin.R;
import ps.exalt.bashar.arabbulletin.models.Item;

/**
 * Created by Abdallah on 7/4/2016.
 */
public class FragmentViewPager extends android.support.v4.app.Fragment {
    private String url;
    public static FragmentViewPager newInstance(Item article) {
        FragmentViewPager f = new FragmentViewPager();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.ARTICLE_KEY, article);
        f.setArguments(bundle);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Item article = (Item) getArguments().getSerializable(Constants.ARTICLE_KEY);
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView titleTextView = (TextView) view.findViewById(R.id.title);
        TextView descriptionTextView = (TextView) view.findViewById(R.id.description);
        TextView dateTextView = (TextView) view.findViewById(R.id.pubDate);

        url = article.getLink();

        if (article.getMediaThumbnail() != null) {
            Picasso.with(getContext()).load(article.getMediaThumbnail().getUrl()).resize(600, 300).into(imageView);
        }
        titleTextView.setText(article.getTitle());
        descriptionTextView.setText(article.getDescription());
        dateTextView.setText(article.getPubDate());
        return view;
    }

    public void openUrl() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
