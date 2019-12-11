# Clojure Spec Test Instrument Broken

## To reproduce

First make sure `.shadow-cljs` doesn't exist. Then run:

```
clj -A:shadow watch tests
```

Point your browser to http://localhost:7711/. All tests should be passing.

Then, stop the `watch`, and then start it again:

```
clj -A:shadow watch tests
```

Go back to http://localhost:7711/. The tests should still be passing.

Now go to `src/app/core_test.cljs` and save the file. The tests should rebuild
and the tests page should run again, but this time the tests will fail.
